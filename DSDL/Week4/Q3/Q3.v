module Q3(x, y, s, carryout, k);
input k;
input [3:0] x,y;
output [3:0] s;
output carryout;
wire [3:0] w;
wire [3:1] c;

assign w[0] = y[0]^k;
assign w[1] = y[1]^k;
assign w[2] = y[2]^k;
assign w[3] = y[3]^k;

fulladder stage0 (k, x[0], w[0], s[0], c[1]);
fulladder stage1 (c[1], x[1], w[1], s[1], c[2]);
fulladder stage2 (c[2], x[2], w[2], s[2], c[3]);
fulladder stage3 (c[3], x[3], w[3], s[3], carryout);
endmodule

module fulladder(Cin, x, y, s, Cout);
input Cin, x, y;
output s, Cout;
assign s = x ^ y ^ Cin;
assign Cout = (x & y) | (x & Cin) | (y & Cin);
endmodule