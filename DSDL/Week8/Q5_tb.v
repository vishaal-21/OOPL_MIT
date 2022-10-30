`timescale 1ns/1ns
`include "Q5.v"

module Q5_tb();
reg [15:0] w;
wire [3:0] y;
wire z;

Q5 q(w,y,z);
initial
begin
$dumpfile("Q5_tb.vcd");
$dumpvars(0,Q5_tb);

w = 16'b0000000000000001; #20;
w = 16'b1000000000000000; #20;
w = 16'b1000010000000000; #20;
w = 16'b0000000000000100; #20;
w = 16'b0000000001000100; #20;
w = 16'b0010000000000000; #20;

$display("Test Complete");
end
endmodule