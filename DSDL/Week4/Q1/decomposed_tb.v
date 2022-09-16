`timescale 1ns/1ns
`include "decomposed.v"

module decomposed_tb();
reg cin,x0,y0;
wire s,cout;
decomposed a1(cin,x0,y0,s,cout);
initial
begin
$dumpfile("decomposed_tb.vcd");
$dumpvars(0, decomposed_tb);

cin=0;x0=0;y0=0;#20;
cin=0;x0=0;y0=1;#20;
cin=0;x0=1;y0=0;#20;
cin=0;x0=1;y0=1;#20;
cin=1;x0=0;y0=0;#20;
cin=1;x0=0;y0=1;#20;
cin=1;x0=1;y0=0;#20;
cin=1;x0=1;y0=1;#20;

$display("Test complete");
end
endmodule