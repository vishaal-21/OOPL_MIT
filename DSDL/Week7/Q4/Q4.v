module mux41(w,s,f);
input [3:0] w;
input [1:0] s;
output reg f;
always @(w or s)
begin
	f = s[1] ? (s[0] ? w[3] : w[2]) : (s[0] ? w[1] : w[0]);
end
endmodule

module Q4(b,g);
input [3:0] b;
output [3:0] g;

wire [3:0] w0,w1,w2,w3;
assign x = b[3] ^ b[2];

assign w0 = {1'b0,1'b1,1'b1,1'b0};
assign w1 = {~b[2],~b[2],b[2],b[2]};
assign w2 = {x,x,x,x};
assign w3 = {b[3],b[3],b[3],b[3]};

mux41 stage0(w0,b[1:0],g[0]);
mux41 stage1(w1,b[1:0],g[1]);
mux41 stage2(w2,b[1:0],g[2]);
mux41 stage3(w3,b[1:0],g[3]);
endmodule