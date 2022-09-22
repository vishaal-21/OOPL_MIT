`timescale 1ns/1ns
`include "Q1.v"

module Q1_tb();
reg [4:0] a,b;
wire lesser,greater,equal;

Q1 m1(a,b,lesser,greater,equal);
initial
begin
$dumpfile("Q1_tb.vcd");
$dumpvars(0,Q1_tb);

a=5'b10001;b=5'b10101;#20;
a=5'b11010;b=5'b10110;#20;
a=5'b10110;b=5'b10110;#20;

$display("Test Complete");
end
endmodule