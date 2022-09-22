`timescale 1ns/1ns
`include "Q2.v"

module Q2_tb();
parameter n=4;
reg [n-1:0] g;
wire [n-1:0] b;

Q2 m1(g,b);
initial
begin
$dumpfile("Q2_tb.vcd");
$dumpvars(0,Q2_tb);

g=4'b1010;#20;
g=4'b1100;#20;
g=4'b1001;#20;

$display("Test Complete");
end
endmodule