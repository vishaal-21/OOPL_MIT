module Q2(w,s,f);
input [15:0] w;
input [3:0] s;
wire [3:0] F;
output f;

mux41 stage1(w[3:0],s[1:0],F[0]);
mux41 stage2(w[7:4],s[1:0],F[1]);
mux41 stage3(w[11:8],s[1:0],F[2]);
mux41 stage4(w[15:12],s[1:0],F[3]);
mux41 stage5(F[3:0],s[3:2],f);
endmodule

module mux41(w,s,f);
input [3:0] w;
input [1:0] s;
output reg f;
always @(w or s)
begin
	f = s[1] ? (s[0] ? w[3] : w[2]) : (s[0] ? w[1] : w[0]);
end
endmodule