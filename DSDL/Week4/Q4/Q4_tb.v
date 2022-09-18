`timescale 1ns/1ns
`include "Q4.v"

module Q4_tb();
reg [1:0] a,b;
wire [2:0] s;
wire cout;

Q4 a1(a,b,s,c1,cout);
initial
begin
$dumpfile("Q4_tb.vcd");
$dumpvars(0, Q4_tb);

a=2'b10;  
b=2'b11;
#20;

$display("Test complete");
end
endmodule