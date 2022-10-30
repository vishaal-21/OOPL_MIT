`timescale 1ns/1ns
`include "Q3.v"

module Q3_tb();
reg [3:0] w;
reg En;
wire [15:0] y;

Q3 m1(w,En,y);
initial begin
$dumpfile("Q3_tb.vcd");
$dumpvars(0,Q3_tb);

w=0;En=1;#20;
w=1;En=1;#20;
w=2;En=1;#20;
w=3;En=1;#20;
w=4;En=1;#20;
w=5;En=1;#20;
w=6;En=1;#20;
w=7;En=1;#20;
w=8;En=1;#20;
w=9;En=1;#20;
w=10;En=1;#20;
w=11;En=1;#20;
w=12;En=1;#20;
w=13;En=1;#20;
w=14;En=1;#20;
w=15;En=1;#20;

$display("Done");
end
endmodule