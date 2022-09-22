`timescale 1ns/1ns
`include "Q3.v"

module Q3_tb();
reg [3:0] w;
wire [3:0] bcd;

Q3 m1(bcd,w);
initial
begin
$dumpfile("Q3_tb.vcd");
$dumpvars(0,Q3_tb);

w=4'b1111; #20;
w=4'b1011;#20;
w=4'b0101;#20;
w=4'b0110;#20;

$display("Test Complete");
end
endmodule