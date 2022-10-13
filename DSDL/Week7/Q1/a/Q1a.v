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

module Q1a(a,b,c,d,f);
input a,b,c,d;
output f;
wire [7:0] w;
wire [2:0] s;

assign w = {~d,1,0,1,1,1,0,0};
assign s = {a,b,c};

mux81 stage1(w,s,f);
endmodule