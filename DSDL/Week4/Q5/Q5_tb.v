`timescale 1ns/1ns
`include "Q5.v"

module Q5_tb();
reg [3:0] a,b;
reg cin;

wire [3:0] s;
wire cout;

Q5 a1(cin,a,b,s,cout);
initial
begin
$dumpfile("Q5_tb.vcd");
$dumpvars(0, Q5_tb);

cin=0;a=6;b=9;  
#20;

cin=0;a=5;b=7;  
#20;

cin=0;a=3;b=5;  
#20;

cin=0;a=4;b=8;  
#20;

cin=0;a=9;b=9;  
#20;

$display("Test complete");
end
endmodule