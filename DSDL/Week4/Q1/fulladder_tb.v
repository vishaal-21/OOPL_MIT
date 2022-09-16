`timescale 1ns/1ns
`include "fulladder.v"

module fulladder_tb();
reg cin,x,y;
wire s,cout;

fulladder a1(cin,x,y,s,cout);
initial
begin
$dumpfile("fulladder_tb.vcd");
$dumpvars(0, fulladder_tb);

cin=0;x=0;y=0;#20;
cin=0;x=0;y=1;#20;
cin=0;x=1;y=0;#20;
cin=0;x=1;y=1;#20;
cin=1;x=0;y=0;#20;
cin=1;x=0;y=1;#20;
cin=1;x=1;y=0;#20;
cin=1;x=1;y=1;#20;

$display("Test complete");
end
endmodule