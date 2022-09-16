`timescale 1ns/1ns
`include "Q3.v"

module Q3_tb();
reg k;
reg [3:0] x,y;
wire carryout;
wire [3:0] s;

Q3 a1(x, y, s, carryout, k);
initial
begin
$dumpfile("Q3_tb.vcd");
$dumpvars(0, Q3_tb);

k=0;
x[0]=1; x[1]=0; x[2]=1; x[3]=1; 
y[0]=1; y[1]=1; y[2]=0; y[3]=0; 
#20;

k=1;
x[0]=1; x[1]=1; x[2]=1; x[3]=0;
y[0]=1; y[1]=0; y[2]=1; y[3]=0;
#20;

$display("Test complete");
end
endmodule