import java.util.*; 

class Student
{
    int regno;
    String name;
    GregorianCalendar doj;
    int semester;
    double gpa;
    double cgpa;
    static int count=0;

    Student()
    {
        count++;
        doj = new GregorianCalendar();
    }

    Student(int count, String name,GregorianCalendar doj,int semester,double gpa,double cgpa)
    {
        this.count=count;
        this.name=name;
        this.doj=doj;
        int year = Integer.valueOf(doj.get(Calendar.YEAR));
        year=year%100;
        this.regno = Integer.valueOf(year+String.format("%02d",count)); 
        this.semester=semester;
        this.gpa=gpa;
        this.cgpa=cgpa;
    }

    static void display(Student[] stu, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("\t"+stu[i].name+"\t\t"+stu[i].regno+"\t\t"+stu[i].doj.get(Calendar.DATE)+"/"+(stu[i].doj.get(Calendar.MONTH)+1)+"/"+
                stu[i].doj.get(Calendar.YEAR)+"\t\t"+stu[i].semester+"\t\t"+stu[i].gpa+"\t\t"+stu[i].cgpa+"\n");
        }        
    }

    void input(Student[] stu,int i)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Date Joined (yyyy/mm/dd): ");
        doj = new GregorianCalendar(sc.nextInt(), sc.nextInt() -1 , sc.nextInt());
        
        System.out.print("Enter Semester: ");
        semester = sc.nextShort();
        
        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();
        
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();

        stu[i]=new Student(count,name,doj,semester,gpa,cgpa);
        System.out.println();
    }

    static void sort(Student[] stu, String mode,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int pos=i;
            for(int j=i+1;j<n;j++) 
            {
                if(mode.equals("semester") && stu[j].semester > stu[pos].semester)
                    pos=j;
                if(mode.equals("cgpa") && stu[j].cgpa > stu[pos].cgpa)
                    pos=j;
                if(mode.equals("name") && (stu[j].name.compareTo(stu[pos].name)) < 0 )
                    pos=j;
            }

            if(pos!=i)                    
            {
                Student temp = stu[i];
                stu[i]=stu[pos];
                stu[pos]=temp;
            }
        }
    }

    static void listnames(Student[] stu, int n, char first)
    {
        int i;
        Student s3[]=new Student[n];
        for(i=0;i<n;i++)
        {
            s3[i] = new Student(stu[i].count,stu[i].name,stu[i].doj,stu[i].semester,stu[i].gpa,stu[i].cgpa);
            if(stu[i].name.charAt(0)==first)
            {
                s3[i].name = stu[i].name;
                display(s3,n);
            }
        }
    }

    static void substr(Student[] stu, int n, String sub)
    {
        Student s1[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            s1[i] = new Student(stu[i].count,stu[i].name,stu[i].doj,stu[i].semester,stu[i].gpa,stu[i].cgpa);
            if(stu[i].name.contains(sub))
            {
                s1[i].name = stu[i].name;
                display(s1,n);
            }
        }
    }

    static void shortname(Student[] stu, int n)
    {
        Student s2[]=new Student[n];
        char temp;
        String tempstr="";
        for(int i=0;i<n;i++)
        {
            s2[i] = new Student(stu[i].count,stu[i].name,stu[i].doj,stu[i].semester,stu[i].gpa,stu[i].cgpa);
            int wc=0;
            for(int j=0;j<stu[i].name.length();j++)
                if(stu[i].name.charAt(j)==' ' && stu[i].name.charAt(j+1)!=' ')
                    wc++;

            wc=wc+1;

            int c=0;
            temp=stu[i].name.charAt(0);
            tempstr+=temp+".";
            for(int j=0;j<stu[i].name.length();j++)
            {
                if(stu[i].name.charAt(j)==' ' && stu[i].name.charAt(j+1)!=' ')
                {
                    c++;
                    if(c<(wc-1))
                    {
                        temp=stu[i].name.charAt(j+1);
                        tempstr+=temp+".";
                    }
                }
                if(c==(wc-1))
                {
                    temp=stu[i].name.charAt(j);  
                    tempstr+=temp; 
                }                
            }
            s2[i].name=tempstr;
            tempstr="";
        }
        display(s2,n);
    }
}

class Q123
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of records: ");
        int n = sc.nextInt();

        Student[] stu = new Student[n];
        for(int i=0;i<n;i++)
        {
            stu[i] = new Student();
            stu[i].input(stu,i);
        }

        int choice=0;
        System.out.print("\n1. Display Records" + 
                        "\n2. Sort by Name" +
                        "\n3. Sort by Semester (Descending)" +
                        "\n4. Sort by CGPA (Descending)" +
                        "\n5. List all Students whose name begins with a character" +
                        "\n6. List all Students whose name contains a string" +
                        "\n7. Change the names of all students to shortened form" +
                        "\n-1 to exit.");
        
        while(choice!=-1)
        {           
            System.out.println("Enter your choice : "); 
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                Student.display(stu,n);
                break;
                
                case 2: 
                Student.sort(stu,"name",n);
                System.out.println("\nSorted by Name.\n");
                Student.display(stu,n);
                break;
                
                case 3: 
                Student.sort(stu, "semester",n);
                System.out.println("\nSorted by Semester.\n");
                Student.display(stu,n);
                break;
                
                case 4: 
                Student.sort(stu, "cgpa",n);
                System.out.println("\nSorted wrt CGPA.\n");
                Student.display(stu,n);
                break;
                
                case 5:
                System.out.print("\nEnter the character: ");
                char ch = sc.next().charAt(0);                
                System.out.println("\nAll the student names starting with \'" + ch + "\' : \n");
                Student.listnames(stu,n,ch);
                break;
                
                case 6: 
                System.out.print("\nEnter the string: ");
                String subs = sc.next();                
                System.out.println("\nAll the student names containing \'" + subs + "\' : \n");
                Student.substr(stu,n,subs);
                break;
                
                case 7:
                Student.shortname(stu, n);
                System.out.println("\nShortened Name.\n");
                break;
            }
        }
    }
}