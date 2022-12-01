`timescale 1ns/1ns
`include "RingCounter.v"

module RingCounter_tb();
reg clk,reset;
wire[0:3]q;

RingCounter m1(clk,reset,q);
always #10 clk=~clk;

initial begin
    $dumpfile("RingCounter_tb.vcd");
    $dumpvars(0,RingCounter_tb);
    clk=0;
    #80 $finish;
end

initial begin
    reset=1;#20;
    reset=0;#60;
end
endmodule