module RingCounter(clk, reset,q);
input clk,reset;
output [0:3]q;
wire [1:0]t;

Counter2Bit c1(clk, reset,t);
decoder24 d1(t,1'b1,q);

endmodule

module decoder24(w,En,y);
input [1:0]w;
input En;
output reg [0:3]y;

always @(w)
begin
    case(w)
        0:y=4'b0001;
        1:y=4'b0010;
        2:y=4'b0100;
        3:y=4'b1000;
    endcase
end
endmodule

module Counter2Bit(clk,reset,q);
input clk,reset;
output [0:1]q;

dff ff1(~q[0],clk,reset,q[0]);
dff ff2(q[0]^q[1],clk,reset,q[1]);
endmodule

module dff(d,clk,reset,q);
input d,clk,reset;
output reg q;

always @(posedge clk or posedge reset)
begin
    if(reset)
        q<=0;
    else
        q<=d;
end
endmodule