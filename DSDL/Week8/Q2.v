module decoder38(w,En,y);
input [2:0] w;
input En;
output reg [7:0] y;
integer k;

always @(w or En)
begin
	for(k=0;k<=7;k=k+1)
	begin
		if(En==0)
			y = 8'b00000000;
		else
		begin
			if(w==k)
				y[k]=1;
			else
				y[k]=0;
		end
	end
end
endmodule

module Q2(w,En,y);
input [3:0] w;
input En;
output [15:0] y;

decoder38 stage1(w[2:0],(~w[3] & En),y[7:0]);
decoder38 stage2(w[2:0],(w[3] & En),y[15:8]);
endmodule