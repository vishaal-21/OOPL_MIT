`timescale 1ns/1ns
`include "Q3.v"

module Q3_tb();
reg [15:0] w;
reg [3:0] s;
wire f;

Q3 m1(w,s,f);
initial
begin
$dumpfile("Q3_tb.vcd");
$dumpvars(0,Q3_tb);

s=4'b0001;w=16'b0010100100101101;#20;
s=4'b1001;w=16'b1101001011100101;#20;
s=4'b0110;w=16'b1100101101001000;#20;
s=4'b0011;w=16'b0001100101110101;#20;
s=4'b1101;w=16'b1100111011101101;#20;

$display("Test Complete");
end
endmodule