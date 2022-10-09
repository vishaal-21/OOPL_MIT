module Q3(w,s,f);
input [15:0] w;
input [3:0] s;
wire [1:0] F;
output f;

mux81 stage1(w[7:0],s[2:0],F[0]);
mux81 stage2(w[15:8],s[2:0],F[1]);
mux21 stage3(F[1:0],s[3],f);
endmodule

module mux81(w,s,f);
input [7:0] w;
input [2:0] s;
output reg f;

always @(w or s)
begin
	case(s)
		0: f = w[0];
		1: f = w[1];
		2: f = w[2];
		3: f = w[3];
		4: f = w[4];
		5: f = w[5];
		6: f = w[6];
		7: f = w[7];
	endcase
end
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