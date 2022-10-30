module decoder24(w,En,y);
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

module Q3(w,En,y);
input [3:0] w;
input En;
output [15:0] y;
wire [3:0] y1;
    
decoder24 stage0(w[3:2],En,y1);
decoder24 stage1(w[1:0],y1[0],y[3:0]);
decoder24 stage2(w[1:0],y1[1],y[7:4]);
decoder24 stage3(w[1:0],y1[2],y[11:8]);
decoder24 stage4(w[1:0],y1[3],y[15:12]);
endmodule