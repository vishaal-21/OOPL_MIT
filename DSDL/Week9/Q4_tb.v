`timescale 1ns/1ns
`include "Q4.v"

module Q4_tb();
reg [2:0] s;
reg En;
reg [7:0] w;
wire f;

Q4 m1(s,En,w,f);
initial begin
$dumpfile("Q4_tb.vcd");
$dumpvars(0,Q4_tb);

En=1;s=0;w=4'b0111;#20;
En=1;s=1;w=4'b0111;#20;
En=1;s=2;w=4'b0111;#20;
En=1;s=3;w=4'b0111;#20;
En=1;s=0;w=4'b1010;#20;
En=1;s=1;w=4'b1010;#20;
En=1;s=2;w=4'b1010;#20;
En=1;s=3;w=4'b1010;#20;

$display("Done");
end
endmodule