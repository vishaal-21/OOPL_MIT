`timescale 1ns/1ns
`include "Q1.v"

module Q1_tb();
reg [2:0] w;
reg En;
wire [7:0] y;

Q1 m1(w,En,y);
initial begin
$dumpfile("Q1_tb.vcd");
$dumpvars(0,Q1_tb);

w=0;En=1;#20;
w=1;En=1;#20;
w=2;En=1;#20;
w=3;En=1;#20;
w=4;En=1;#20;
w=5;En=1;#20;
w=6;En=1;#20;
w=7;En=1;#20;

$display("Done");
end
endmodule