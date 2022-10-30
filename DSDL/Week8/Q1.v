module decoder24(w,En,y);
input [1:0] w;
input En;
output reg [3:0] y;

always @(w or En)
begin
	if(En==0)
		y = 4'b0000;
	else
	begin
		if(w==0)
			y = 4'b0001;
		else if(w==1)
			y = 4'b0010;
		else if(w==2)
			y = 4'b0100;
		else if(w==3)
			y = 4'b1000;
	end
end
endmodule

module Q1(w,En,y);
input [2:0] w;
input En;
output [7:0] y;

decoder24 stage1(w[1:0],(~w[2] & En),y[3:0]);
decoder24 stage2(w[1:0],(w[2] & En),y[7:4]);
endmodule