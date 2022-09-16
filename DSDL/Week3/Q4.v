module Q4(A,B,C,D,f);
input A,B,C,D;
output f;
nor(e,D,D);
nor(g,A,e);
nor(h,C,e);
nor(i,g,h);
nor(f,i,i);
endmodule