module Q5(cin,a,b,s,cout);
input [3:0] a,b;
input cin;

output [3:0] s;
output cout;

wire [3:0] z,u;

fourbitadd f1(cin,a,b,z,co);
assign cout = co | (z[3] & z[2]) | (z[3] & z[1]);
assign u[0]=0;
assign u[1]=cout;
assign u[2]=cout;
assign u[3]=0;
fourbitadd f2(0,z,u,s,cx);
endmodule

module fourbitadd(cin,x,y,s,cout);
input cin;
input [3:0] x,y;
output cout;
output [3:0] s;
wire [3:1] c;

fulladder stage0(cin,x[0],y[0],s[0],c[1]);
fulladder stage1(c[1],x[1],y[1],s[1],c[2]);
fulladder stage2(c[2],x[2],y[2],s[2],c[3]);
fulladder stage3(c[3],x[3],y[3],s[3],cout);
endmodule

module fulladder(Cin, x, y, s, Cout);
input Cin, x, y;
output s, Cout;
assign s = x ^ y ^ Cin;
assign Cout = (x & y) | (x & Cin) | (y & Cin);
endmodule