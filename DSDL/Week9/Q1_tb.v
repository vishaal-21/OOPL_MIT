`timescale 1ns/1ns
`include "Q1.v"

module Q1_tb();
reg a,b,c,d,En;
wire f;

Q1 m1(a,b,c,d,En,f);
initial begin
$dumpfile("Q1_tb.vcd");
$dumpvars(0,Q1_tb);

a=0;b=0;c=0;d=0;En=1;#20;
a=0;b=0;c=0;d=1;En=1;#20;
a=0;b=0;c=1;d=0;En=1;#20;
a=0;b=0;c=1;d=1;En=1;#20;
a=0;b=1;c=0;d=0;En=1;#20;
a=0;b=1;c=0;d=1;En=1;#20;
a=0;b=1;c=1;d=0;En=1;#20;
a=0;b=1;c=1;d=1;En=1;#20;
a=1;b=0;c=0;d=0;En=1;#20;
a=1;b=0;c=0;d=1;En=1;#20;
a=1;b=0;c=1;d=0;En=1;#20;
a=1;b=0;c=1;d=1;En=1;#20;
a=1;b=1;c=0;d=0;En=1;#20;
a=1;b=1;c=0;d=1;En=1;#20;
a=1;b=1;c=1;d=0;En=1;#20;
a=1;b=1;c=1;d=1;En=1;#20;

$display("Done");
end
endmodule