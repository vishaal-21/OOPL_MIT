`timescale 1ns/1ns
`include "Q3.v"

module Q3_tb();
reg [3:0] b;
wire [3:0] e;

Q3 m1(b,e);
initial begin
$dumpfile("Q3_tb.vcd");
$dumpvars(0,Q3_tb);

b=4'b1001;#20;
b=4'b0001;#20;
b=4'b0101;#20;
b=4'b0111;#20;

$display("Test Complete");
end
endmodule