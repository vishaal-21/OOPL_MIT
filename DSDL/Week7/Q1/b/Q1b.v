module mux41(w,s,f);
input [3:0] w;
input [1:0] s;
output reg f;
always @(w or s)
begin
	f = s[1] ? (s[0] ? w[3] : w[2]) : (s[0] ? w[1] : w[0]);
end
endmodule

module Q1b(a,b,c,d,f);
input a,b,c,d;
output f;
wire [3:0] w;
wire [1:0] s;

assign s = {a,b};
assign w= {0,0,d,(c | ~d)};

mux41 stage1(w,s,f);
endmodule