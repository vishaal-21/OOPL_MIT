`timescale 1ns/1ns
`include "Counter2Bit.v"

module Counter2Bit_tb();
reg clk,reset;
wire[1:0]q;

Counter2Bit m1(clk,reset,q);
always #10 clk=~clk;

initial begin
    $dumpfile("Counter2Bit_tb.vcd");
    $dumpvars(0,Counter2Bit_tb);
    clk=0;
    #80 $finish;
end

initial begin
    reset=1;#20;
    reset=0;#60;
end
endmodule