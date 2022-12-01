`timescale 1ns/1ns
`include "jkff.v"

module jkff_tb();
reg j,k,clk,reset;
wire q;

jkff m1(j,k,clk,reset,q);
always #10 clk=~clk;

initial begin
    $dumpfile("jkff_tb.vcd");
    $dumpvars(0,jkff_tb);
    clk=0;
    #80 $finish;
end

initial begin
    j=1;k=1;reset=1;#10
    j=0;k=1;reset=0;#20
    j=0;k=0;reset=1;#20
    j=1;k=0;reset=1;#20
    j=0;k=1;reset=0;#10
    $display("Done");
end
endmodule