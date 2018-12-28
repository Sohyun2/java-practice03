package tv;

public class TV {
	private final int MIN_CHANNEL = 0;
	private final int MAX_CHANNEL = 50; // 51이 되면 0으로 돌아가야함
	private final int MIN_VOLUME = 0;
	private final int MAX_VOLUME = 20;

	private boolean power; // true가 되어야 함
	private int channel;
	private int volume;

	public TV() {
		this.power = false;
	}	
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void channel(int channel) {
		// 숫자 버튼으로 채널 조정
		
		this.channel = channel;
	}

	public void channel(boolean up) {
		// 화살표 버튼으로만 채널 조정
		
		if(channel > MAX_CHANNEL) {
			channel = 0;
			return;
		}else if(channel < MIN_CHANNEL) {
			channel = 50;
			return;
		}	
		
		if(up) //true 채널 올리기
			this.channel++;
		else //false 채널 내리기
			this.channel--;
		
		
		
	}
	
	public void volume(boolean up) {
		// +/- 버튼으로 볼륨 조절
		
		if(this.volume == MAX_VOLUME) {
			volume = 0;
			return;
		} else if(this.volume == MIN_VOLUME) {
			volume = 50;
			return;
		}
		
		if(up) // true 볼륨 업 
			volume++;
		else
			volume--;
	}
	
	public void volume(int volume) {
		
		if(volume > MAX_VOLUME) {
			this.volume = 0;
			return;
		} else if(volume < MIN_VOLUME) {
			this.volume = 50;
			return;
		}
		this.volume = volume;
	}
	public void status() {
		System.out.println("TV[power="+ power 
				+ ", channel=" + channel 
				+ ", volume=" + volume + "]");
	}

}
