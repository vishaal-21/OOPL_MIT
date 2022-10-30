`timescale 1ns/1ns
`include "Q4.v"

module Q4_tb();
reg [3:0] w;
wire [1:0] y;
wire z;

Q4 q(w,y,z);
initial
begin
$dumpfile("Q4_tb.vcd");
$dumpvars(0,Q4_tb);

w = 4'b0000; #20;
w = 4'b0001; #20;
w = 4'b0010; #20;
w = 4'b0100; #20;
w = 4'b0110; #20;
w = 4'b1000; #20;

$display("Test Complete");
end
endmodule