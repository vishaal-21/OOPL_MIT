module Q2(a,b,c,d,En,F,G,H);
input a,b,c,d,En;
wire [15:0] f1,f2,f3;
output F,G,H;

wire [3:0] w={a,b,c,d};

decoder4to16 stage1(w,En,f1);
decoder4to16 stage2(w,En,f2);
decoder4to16 stage3(w,En,f3);
assign F = f1[3] | f1[6] | f1[7] | f1[10] | f1[11] | f1[14];
assign G = f2[2] | f2[3] | f2[10] | f2[14];
assign H = f3[0] | f3[1] | f3[3] | f3[7] | f3[14] | f3[15];
endmodule

module decoder4to16(w,En,y);
input [3:0] w;
input En;
output [15:0] y;
wire [3:0] y1;
    
decoder2to4 stage0(w[3:2],En,y1);
decoder2to4 stage1(w[1:0],y1[0],y[3:0]);
decoder2to4 stage2(w[1:0],y1[1],y[7:4]);
decoder2to4 stage3(w[1:0],y1[2],y[11:8]);
decoder2to4 stage4(w[1:0],y1[3],y[15:12]);
endmodule

module decoder2to4(w,En,y);
input [1:0] w;
input En;
output reg [3:0] y;
always @(w or En)
begin
	y=4'b0000;
    if (En == 1)
    begin
            case(w)
            0:  y=4'b0001;
            1:  y=4'b0010;
            2:  y=4'b0100;
            3:  y=4'b1000;
            endcase
    end
end
endmodule