module Q1(A,B,C,D,f);
input A,B,C,D;
output f;
nand(e,B,B);
nand(g,D,D);
nand(h,A,e);
nand(i,C,g);
nand(j,h,i);
nand(f,j,j);
endmodule