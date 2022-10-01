`timescale 1ns/1ns
`include "Q4.v"

module Q4_tb();
reg [3:0]a,b;
wire greater,lesser,equal;

Q4 m1(a,b,greater,lesser,equal);
initial
begin
$dumpfile("Q4_tb.vcd");
$dumpvars(0,Q4_tb);

a=4'b1111;b=4'b1111;#20;
a=4'b1011;b=4'b1001;#20;
a=4'b0010;b=4'b0101;#20;

$display("Test Complete");
end
endmodule