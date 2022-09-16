module Q2(A,B,C,D,f);
input A,B,C,D;
output f;
nor(e,D,D);
nor(g,A,C,e);
nor(h,B,C);
nor(i,B,D);
nor(j,h,g,i);
nor(f,j,j);
endmodule
