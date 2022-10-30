module Q4(w,s4,f);
input [3:0] w;
input [1:0] s4;
output reg f;

function mux21;
input [1:0] w;
input s2;

if(s2==0)
		mux21=w[0];
	else
		mux21=w[1];
endfunction

always @(w or s4)
begin
	if(s4[1]==0)
		f=mux21(w[1:0],s4[0]);
	else if(s4[1]==1)
		f=mux21(w[3:2],s4[0]);
end
endmodule