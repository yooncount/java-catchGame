package catchGame.monster;

public class Monster3 extends MonsterBase {

	public Monster3() {
		super("다꼬리");
		this.spawnMap = "땅";
		this.present = "노말 타입 포켓몬 | 잡기 귀찮은 고양이, 10번 찔러도 1번도 안 잡힐 자신감으로 하루를 보내는 고양이의 자존심";
	}

	// 마주쳤을 때
	// 등장멘트
	@Override
	public void appearanceComment() {
		System.out.println("=========포켓몬 조우=========");
		this.probabilityValue = r.nextInt(3);
		if (this.probabilityValue == 0) {
			System.out.println(
					"\"다꼬리가 땅에서 빠져나왔다! 마치 땅속에서 인생을 포기한 듯…\"\n" + "➤ \"꼬리 꼬리~!\"\n" + "(어쩐지 발톱에 묻은 흙이 좀 많은 듯.)");
		} else if (this.probabilityValue == 1) {
			System.out.println("\"다꼬리가 슬쩍 땅속에서 고개를 내밀었다! 그 모습은 마치… 사라지려는 고양이 같다고?\"\n" + "➤ \"꼬리가 땅을 두드린다!\"\n"
					+ "(마치 ‘날 놓치지 마라!’라는 듯한 땅속 고양이의 시선.)");
		} else {
			System.out.println(
					"\"다꼬리가 등장했다! 머리는 보이지 않고 다리만 보인다…\"\n" + "➤ \"꼬리~ 꼬리~!\"\n" + "(오늘도 여전히 땅속에서 쉬고 싶어하는 다꼬리.)");
		}
		System.out.println();
	}

	// 도망칠 확률 "개별사건"
	// 67% => 67/100
	// 랜덤 값 1~67 나오면 도망, 그외 숫자 안 도망침
	// 반환 값 => 도망칠 때:false | 안도망칠 때:true
	@Override
	public boolean runMonster() {
		this.probabilityValue = r.nextInt(3);

		// 도망칠 때 false
		if (this.r.nextInt(100) + 1 <= 67) {
			System.out.println("=========포켓몬이 도망쳤다!=========");
			if (this.probabilityValue == 0) {
				System.out.println("\"67% 확률로 다꼬리가 갑자기 땅속으로 사라졌다! ‘어디 갔지?’ 하고 쳐다보니… 이미 도망갔다!\"\n" + "➤ \"꼬리~꼬리~!\"\n"
						+ "(그 사교성 좋은 다꼬리가 당신을 피한다, 당신의 사상이 의심스럽다!)");
			} else if (this.probabilityValue == 1) {
				System.out.println("\"67% 확률로 다꼬리가 도망가려고 한다! 땅속으로 휙~! ‘나 갈게~’라며 살짝 도망쳤다!\"\n" + "➤ \"꼬리~ 꼬리~!\"\n"
						+ "(도망치는 다꼬리, 땅속으로 사라지기 전에 마지막으로 한 마디 남긴다!)");
			} else {
				System.out.println("\"67% 확률로 다꼬리가 흙 속으로 사라졌다! ‘도망친다!’ 하고 외쳤지만… 사실 아무도 그 소리를 듣지 못했다.\"\n"
						+ "➤ \"꼬리~ 꼬리~!\"\n" + "(다시 땅속으로 조용히 숨어버린 다꼬리.)");
			}
			System.out.println();
			return false;
		}
		// 안 도망칠 때 true
		System.out.println("=========포켓몬이 도망치지 않았다!=========");
		if (this.probabilityValue == 0) {
			System.out.println("\"23% 확률로 다꼬리가 도망가기는커녕 자리를 잡고 앉았다! ‘저기, 나 지금 땅속에 있는 거 알지?’라는 표정이다.\"\n"
					+ "➤ \"꼬리~ 꼬리~!\"\n" + "(도망칠 생각 없고, 그냥 땅속에서 쉬고 싶다는 눈빛.)");
		} else if (this.probabilityValue == 1) {
			System.out.println("\"23% 확률로 다꼬리가 도망가지 않는다! 오히려 '왜 나한테만 그런 말을 하냐?'는 표정으로 앉아있다.\"\n" + "➤ \"꼬리~ 꼬리~!\"\n"
					+ "(도망칠 생각은 없다. 그냥 여기서 땅속을 즐기겠다는 다꼬리.)");
		} else {
			System.out.println("\"23% 확률로 다꼬리가 멈췄다! 도망갈 생각은 전혀 없다. 오히려 ‘왜 도망가야 하지?’라는 표정이다.\"\n" + "➤ \"꼬리~ 꼬리~!\"\n"
					+ "(도망칠 기세가 아니라 땅속에서 자리를 잡고 앉아있는 다꼬리.)");
		}
		System.out.println();
		return true;
	}

	// 잡힐 확률 "개별사건"
	// 75% => 3/4
	// 반환 값 => 잡혔을 때:true | 아닐 때:false
	@Override
	public boolean catchMonster() throws InterruptedException {
		delayTime();
		// 잡혔을 때 true
		if (this.r.nextInt(4) + 1 <= 3) {
			System.out.println("=========포켓몬 포획 성공!=========");
			System.out.println("\"75% 확률로 주인 없는 다꼬리가 잡혔다! 사실 도망가려다 귀찮아서 그냥 포켓볼 안으로 굴러 들어갔다.\"\n"
					+ "➤ \"꼬리~ 꼬리~ (여기 눕기 괜찮네...)\"\n" + "(다꼬리는 포켓볼 안에서 이불처럼 말려 자고 있다.)");
			System.out.println();
			this.ifCatch = true;
			return true;
		}
		// 안 잡혔을 때 false
		System.out.println("=========포켓몬 포획 실패!=========");
		System.out.println("\"25% 확률로 다꼬리가 잡히지 않았다! 포켓볼을 보자마자 땅속으로 직진, ‘어디 갔지?’라는 말이 끝나기도 전에 사라졌다.\"\n"
				+ "➤ \"꼬리~! (다음에 또 와~)\"\n" + "(남은 건 다꼬리의 꼬리 자국과 포켓볼의 허탈한 굴절.)");
		System.out.println();
		return false;
	}

}
