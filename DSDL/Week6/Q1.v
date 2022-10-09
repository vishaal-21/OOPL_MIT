module Q1(w,s,f);
input [3:0] w;
input [1:0] s;
wire [1:0] F;
output f;

mux21 stage1(w[1:0],s[0],F[0]);
mux21 stage2(w[3:2],s[0],F[1]);
mux21 stage3(F[1:0],s[1],f);
endmodule

module mux21 (w, s, f);
input [1:0] w;
input s;
output reg f;
always @(w or s)
begin
	if(s==0)
		assign f=w[0];
	else
		assign f=w[1];
end
endmodule