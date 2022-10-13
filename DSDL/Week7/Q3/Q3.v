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

module Q3(b,e);
input [3:0] b;
output [3:0] e;

wire [7:0] w0,w1,w2,w3;

assign w0 = {1'b0,~b[3],1'b0,~b[3],1'b0,~b[3],1'b0,1'b1};
assign w1 = {~b[3],1'b0,1'b0,~b[3],~b[3],1'b0,1'b0,1'b1};
assign w2 = {1'b0,1'b0,1'b0,~b[3],~b[3],~b[3],1'b1,1'b0};
assign w3 = {~b[3],~b[3],~b[3],1'b0,1'b0,1'b0,b[3],b[3]};

mux81 stage0(w0,b[2:0],e[0]);
mux81 stage1(w1,b[2:0],e[1]);
mux81 stage2(w2,b[2:0],e[2]);
mux81 stage3(w3,b[2:0],e[3]);
endmodule