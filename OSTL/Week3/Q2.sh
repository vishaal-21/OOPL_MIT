echo Enter number of terms
read n
echo First $n odd numbers are
i=1
while test $i -le $n
do
	if [ `expr $i % 2` != 0 ] 
	then
		echo $i
	fi

	i=`expr $i + 1`
done