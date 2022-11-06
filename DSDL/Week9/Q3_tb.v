`timescale 1ns/1ns
`include "Q3.v"

module Q3_tb();
reg a,b,c,En;
wire f;

Q3 m1(a,b,c,En,f);
initial begin
$dumpfile("Q3_tb.vcd");
$dumpvars(0,Q3_tb);

a=0;b=0;c=0;En=1;#20;
a=0;b=0;c=1;En=1;#20;
a=0;b=1;c=0;En=1;#20;
a=0;b=1;c=1;En=1;#20;
a=1;b=0;c=0;En=1;#20;
a=1;b=0;c=1;En=1;#20;
a=1;b=1;c=0;En=1;#20;
a=1;b=1;c=1;En=1;#20;

$display("Done");
end
endmodule