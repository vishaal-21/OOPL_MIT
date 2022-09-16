`timescale 1ns/1ns
`include "halfadder.v"

module halfadder_tb();
reg x,y;
wire s,cout;
halfadder a1(x,y,s,cout);
initial
begin
$dumpfile("halfadder_tb.vcd");
$dumpvars(0, halfadder_tb);

x=0;y=0;#20;
x=0;y=1;#20;
x=1;y=0;#20;
x=1;y=1;#20;

$display("Test complete");
end
endmodule