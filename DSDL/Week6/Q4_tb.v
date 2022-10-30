`timescale 1ns/1ns
`include "Q4.v"

module Q4_tb();
reg [3:0] w;
reg [1:0] s;
wire f;

Q4 m1(w,s,f);
initial
begin
$dumpfile("Q4_tb.vcd");
$dumpvars(0,Q4_tb);

s=2'b00;w=4'b0001;#20;
s=2'b10;w=4'b0010;#20;
s=2'b01;w=4'b0011;#20;
s=2'b00;w=4'b0111;#20;
s=2'b10;w=4'b1000;#20;
s=2'b00;w=4'b1010;#20;
s=2'b01;w=4'b1011;#20;
s=2'b11;w=4'b1111;#20;

$display("Test Complete");
end
endmodule