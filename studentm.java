package test1;

import java.util.*;

import java.lang.*;

public class studentm {

	static List listA = new ArrayList();// 이름
	static List listB = new ArrayList();// 학번
	static List listC = new ArrayList();// 전화번호
	static List listemail = new ArrayList();
	static List listdepart = new ArrayList();// 소속(학부)
	static List listSc = new ArrayList();// 장학금

	List listsub = new ArrayList();//수강한
	List listscore = new ArrayList();//수강한 성적
	List listCscore = new ArrayList();//수강중인

	static List listsubname = Arrays.asList("컴퓨터개론", "정보보호개론", "정보통신기초및실험", "무인기술기초및실험", "융합설계입문", "데이터구조", "객체지향프로그래밍",
			"고급프로그래밍", "정보보호법", "스크립트 프로그래밍", "회로이론및실험", "전자기학", "광기술학", "VI계측및실습I", "전자회로설계 및 실험 I", "3DCAD",
			"마이크로프로세서및실험", "데이터통신", "알고리즘", "운영체제", "시스템프로그래밍", "암호 및 보안 프로토콜", "웹보안", "역공학", "자바프로그래밍", "마이크로컨트롤러및실험",
			"전파공학", "광공학개론I", "VI계측 및 실습II", "전자회로 설계 및 실험 II", "컴퓨터구조", "컴퓨터네트워크", "모바일프로그래밍", "인터넷응용및실습",
			"컴퓨터교과교재연구및지도법", "시스템 보안", "악성코드분석", "물리층보안공학", "통신망공학", "디지털신호처리및설계", "통신이론", "전자회로", "무인기술실험및실습I",
			"센서공학개론I", "전자기액츄에이터설계및실습", "공학수학I", "무인기술마이크로컨트롤러", "프로그래밍언어론", "소프트웨어공학", "네트워크프로그래밍", "임베디드시스템및실습",
			"컴퓨터신기술", "컴퓨터교과논리및논술", "사물인터넷보안", "보안관제론", "네트워크 공격과 탐지 차단 시스템", "해킹 및 침해사고분석", "임베디드OS", "디지털시스템",
			"인터넷통신", "디지털통신", "센서회로", "무인기술실험및실습II", "광공학개론II", "무인광기술및실험I", "센서공학개론II", "공학수학II", "데이터베이스", "프로젝트관리",
			"웹프로그래밍", "엔터프라이즈프로그래밍", "컴퓨터교과교육론", "정보보호실무", "디지털스테가노그래피", "어플레케이션 보안", "SW보안공학", "응용프로그래밍", "임베디드시스템",
			"통신시스템", "센서네트워크", "정보통신실무", "무인기술실험및실습III", "무인광기술및실험II", "최신광공학기술세미나", "무장계측기술", "캡스턴디자인", "데이터베이스프로그래밍",
			"컴퓨터그래픽스", "컴파일러", "인공지능", "디지털포렌식", "정보보안관리", "모바일보안", "사물인터넷 실무", "이동통신시스템", "무인기술세미나", "전자소자공학", "현장실습");
	static List Listsubpro = Arrays.asList("이강수", "이강수", "백제인", "장수", "소우영", "최의인", "이만희", "정진만", "이재광", "이재광", "류성한",
			"류성한", "남충희", "남충희", "백제인", "임천석", "은성배", "정진만", "정진만", "최의인", "이만희", "이극", "이상구", "이재광", "이만희", "은성배",
			"백제인", "남충희", "남충희", "백제인", "이상구", "이극", "이재광", "박성우", "윤영선", "박영태", "김일준", "차신", "정진만", "최의인", "이만희", "이극",
			"이상구", "이재광", "이만희", "은성배", "백제인", "남충희", "남충희", "백제인", "이상구", "이극", "이재광", "박성우", "윤영선", "박영태", "김일준",
			"차신", "백제인", "장수", "소우영", "최의인", "이만희", "정진만", "이재광", "이재광", "류성한", "류성한", "남충희", "남충희", "백제인", "임천석",
			"은성배", "정진만", "정진만", "최의인", "이만희", "이극", "이상구", "이재광", "이만희", "은성배", "백제인", "남충희", "남충희", "백제인", "이상구",
			"이극", "이재광", "박성우", "윤영선", "박영태", "김일준", "차신", "정진만", "이극", "이상구", "이만희");
	static List Listsubroom = Arrays.asList("3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2",
			"3-3-0", "3-2-2", "3-1-4", "3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-1-4", "3-2-2", "3-3-0", "3-3-0", "3-3-0",
			"3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-3-0",
			"3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-3-0", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-3-0",
			"3-2-2", "3-3-0", "3-2-2", "3-3-0", "3-3-0", "3-2-2", "3-2-2", "3-3-0", "2-2-0", "3-3-0", "3-3-0", "3-2-2",
			"3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-2-2", "3-3-0", "3-3-0", "3-3-0",
			"3-3-0", "3-2-2", "3-2-2", "3-3-0", "3-1-4", "3-3-0", "3-2-2", "3-3-0", "3-2-2", "3-2-2", "3-2-2", "3-2-2",
			"3-2-2", "3-2-2", "3-2-2", "3-3-0", "3-3-0", "3-2-2-3", "3-2-2", "3-3-0", "3-3-0", "3-3-0", "3-2-2",
			"3-3-0", "3-2-2", "3-3-0", "3-3-0", "3-3-0", "3-3-0", "3-2-2");

	public static void student_add() { // 학생 추가 함수
		Scanner input = new Scanner(System.in);

		System.out.print("이름 : ");
		listA.add(input.next());

		System.out.print("학번 : ");// 중복 불가..
		while (true) {
			String s = input.next();
			if (listB.contains(s) == true) {
				System.out.println("중복된 학번입니다. 다시 입력해주세요.");
				continue;
			} else {
				listB.add(s);
				break;
			}
		}
		System.out.print("전화번호  : ");
		listC.add(input.next());

		System.out.print("이메일: ");
		listemail.add(input.next());

		System.out.print("소속 : ");
		listdepart.add(input.next());

		System.out.print("장학금 : ");
		listSc.add(input.next());

	}

	public static int student_del() {// 학생 삭제함수
		Scanner input = new Scanner(System.in);

		System.out.println("삭제할 학번을 쓰시오!");
		int po2 = listB.indexOf(input.next());

		if (po2 == -1) {
			System.out.println("없는 번호입니다. ");
			return -1;
		}
		try {
			System.out.println("이름:" + listA.get(po2));
			System.out.println("학번:" + listB.get(po2));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("없는 번호입니다.");
			return -1;
		}
		listA.remove(po2);
		listB.remove(po2);
		listC.remove(po2);
		listemail.remove(po2);
		listdepart.remove(po2);
		System.out.println("삭제되었습니다.");
		return po2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listA.addAll(Arrays.asList("한정우", "한병준", "김지수", "이석기", "김대은", "홍길동", "김관순", "이유민", "아이유", "이만희", "홍길동", "김기수",
				"안철수", "문재인", "강주성", "강찬욱", "고윤정", "김명철", "김현중", "김현중", "신혜원", "안상윤", "윤서정", "이경민", "이경헌", "이규호", "이종태",
				"이채연", "전운텍", "조명상", "최민지", "최재성", "최지영", "김지숨", "김지숙", "고윤상", "강상우", "곽진석", "권순혁", "홍김동"));// 이름
		listB.addAll(Arrays.asList("20140001", "20140002", "20140003", "20140004", "20140005", "20140006", "20140007",
				"20140008", "20140009", "20140010", "20150001", "20150002", "20150003", "20150004", "20150005",
				"20150006", "20150007", "20150008", "20150009", "20150010", "20160001", "20160002", "20160003",
				"20160004", "20160005", "20160006", "20160007", "20160008", "20160009", "20160010", "20170001",
				"20170002", "20170003", "20170004", "20170005", "20170006", "20170007", "20170008", "20170009",
				"20170010"));// 학번
		listC.addAll(Arrays.asList("010-0000-0001", "010-0000-0002", "010-0000-0003", "010-0000-0004", "010-0000-0005",
				"010-0000-0006", "010-0000-0007", "010-0000-0008", "010-0000-0009", "010-0000-0010", "010-0000-0011",
				"010-0000-0012", "010-0000-0013", "010-0000-0014", "010-0000-0015", "010-0000-0016", "010-0000-0017",
				"010-0000-0018", "010-0000-0019", "010-0000-0020", "010-0000-0021", "010-0000-0022", "010-0000-0023",
				"010-0000-0024", "010-0000-0025", "010-0000-0026", "010-0000-0027", "010-0000-0028", "010-0000-0029",
				"010-0000-0030", "010-0000-0031", "010-0000-0032", "010-0000-0033", "010-0000-0034", "010-0000-0035",
				"010-0000-0036", "010-0000-0037", "010-0000-0038", "010-0000-0039", "010-0000-0040"));
		listemail.addAll(Arrays.asList("a@naver.com", "b@naver.com", "c@naver.com", "d@naver.com", "e@naver.com",
				"f@naver.com", "g@naver.com", "h@naver.com", "i@naver.com", "j@naver.com", "k@naver.com", "l@naver.com",
				"m@naver.com", "n@naver.com", "o@naver.com", "p@naver.com", "q@naver.com", "r@naver.com", "s@naver.com",
				"t@naver.com", "u@naver.com", "v@naver.com", "w@naver.com", "x@naver.com", "y@naver.com", "z@naver.com",
				"a1@naver.com", "a2@naver.com", "a3@naver.com", "a4@naver.com", "a5@naver.com", "a6@naver.com",
				"a7@naver.com", "a8@naver.com", "a9@naver.com", "a10@naver.com", "a11@naver.com", "a12@naver.com",
				"a13@naver.com", "a14@naver.com"));
		listdepart.addAll(Arrays.asList("컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부",
				"컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부",
				"컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부",
				"컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부", "컴퓨터공학부",
				"컴퓨터공학부", "컴퓨터공학부"));
		listSc.addAll(Arrays.asList("50", "100", "400", "200", "50", "100", "30", "200", "80", "100", "50", "100",
				"400", "200", "50", "100", "30", "200", "80", "100", "50", "100", "400", "200", "50", "100", "30",
				"200", "80", "100", "50", "100", "400", "200", "50", "100", "30", "200", "80", "100"));

		Scanner input = new Scanner(System.in);

		ArrayList<studentm> st = new ArrayList<studentm>();

		studentm stu1 = new studentm();

		// 4학년 하드코딩
		// 0번학생
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));
		st.add(0, stu1);

		stu1 = new studentm();

		// 1번학생
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));
		st.add(1, stu1);
		stu1 = new studentm();
		// 2
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));
		st.add(2, stu1);
		stu1 = new studentm();
		// 3
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));

		st.add(3, stu1);
		stu1 = new studentm();
		// 4
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 30, 31, 32, 33, 34, 47, 48, 49,
				50, 51, 52));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5));
		stu1.listCscore.addAll(Arrays.asList(67, 68, 69, 70, 71));

		st.add(4, stu1);
		stu1 = new studentm();
		// 5
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(71, 72, 73, 74, 75, 76, 77));

		st.add(5, stu1);
		stu1 = new studentm();
		// 6
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(78, 79, 80, 81, 82, 83, 84));

		st.add(6, stu1);
		stu1 = new studentm();
		// 7
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(85, 86, 87, 88, 89, 90, 91));

		st.add(7, stu1);
		stu1 = new studentm();
		// 8
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(91, 92, 93, 94, 95, 96, 97));

		st.add(8, stu1);
		stu1 = new studentm();
		// 9
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 35, 36, 37, 38, 40, 41, 42, 43,
				46, 64, 70, 71, 80, 96, 97));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 3.5, 3.5, 3.5, 4.0, 3.5, 3.0, 4.0, 4.5, 4.3, 4.3, 4.0,
				3.5, 3.0, 4.0, 3.5, 4.3, 4.3, 3.0, 3.5, 3.5, 3.5, 3.5, 4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(81, 83, 85, 88, 90, 93));

		st.add(9, stu1);
		stu1 = new studentm();
		// 10 3학년
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(31, 32, 33, 34, 35, 36, 37));
		st.add(10, stu1);
		stu1 = new studentm();
		// 11
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(38, 39, 40, 41, 42, 43, 44));

		st.add(11, stu1);
		stu1 = new studentm();
		// 12
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(45, 46, 47, 48, 49, 50));

		st.add(12, stu1);
		stu1 = new studentm();
		// 13
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(51, 52, 53, 54, 55, 56, 57));

		st.add(13, stu1);
		stu1 = new studentm();
		// 14
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(58, 59, 60, 61, 62, 63));

		st.add(14, stu1);
		stu1 = new studentm();
		// 15
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(30, 32, 36, 64, 65, 66, 67));

		st.add(15, stu1);
		stu1 = new studentm();
		// 16
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(36, 49, 51, 56, 60, 67));

		st.add(16, stu1);
		stu1 = new studentm();
		// 17
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(30, 36, 49, 51, 52, 53));

		st.add(17, stu1);
		stu1 = new studentm();
		// 18
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(32, 45, 46, 48, 53, 60));

		st.add(18, stu1);
		stu1 = new studentm();
		// 19
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 22, 23, 24, 27, 28));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0, 2.0, 2.5, 3.5, 3.0, 4.0, 3.5, 3.0, 3.0, 2.5, 4.3, 2.5));
		stu1.listCscore.addAll(Arrays.asList(30, 40, 50, 60, 62, 63));

		st.add(19, stu1);
		stu1 = new studentm();
		// 20 2학년
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(20, stu1);
		stu1 = new studentm();
		// 21
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(21, stu1);
		stu1 = new studentm();
		// 22
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(22, stu1);
		stu1 = new studentm();
		// 23
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));
		st.add(23, stu1);
		stu1 = new studentm();

		// 24

		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7));

		st.add(24, stu1);
		stu1 = new studentm();

		// 25
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(4, 5, 6, 7, 8, 9));

		st.add(25, stu1);
		stu1 = new studentm();

		// 26
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(10, 11, 12, 13, 14));

		st.add(26, stu1);
		stu1 = new studentm();

		// 27
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(15, 16, 17, 18, 19, 20));

		st.add(27, stu1);
		stu1 = new studentm();

		// 28
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(21, 22, 23, 24, 25, 26));

		st.add(28, stu1);
		stu1 = new studentm();

		// 29
		stu1.listsub.addAll(Arrays.asList(0, 1, 2, 3));
		stu1.listscore.addAll(Arrays.asList(4.0, 4.0, 3.5, 4.0));
		stu1.listCscore.addAll(Arrays.asList(21, 22, 27, 28, 29));

		st.add(29, stu1);
		stu1 = new studentm();

		// 30 1학년
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(30, stu1);
		stu1 = new studentm();

		// 31
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));
		st.add(31, stu1);
		stu1 = new studentm();

		// 32
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));
		st.add(32, stu1);
		stu1 = new studentm();

		// 33
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(33, stu1);
		stu1 = new studentm();

		// 34
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(34, stu1);
		stu1 = new studentm();

		// 35

		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(35, stu1);
		stu1 = new studentm();

		// 36
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(36, stu1);
		stu1 = new studentm();

		// 37
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(37, stu1);
		stu1 = new studentm();

		// 38
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(38, stu1);
		stu1 = new studentm();

		// 39
		stu1.listsub.addAll(Arrays.asList());
		stu1.listscore.addAll(Arrays.asList());
		stu1.listCscore.addAll(Arrays.asList(0, 1, 2, 3));

		st.add(39, stu1);
		stu1 = new studentm();

		// 40
		boolean exit=false;
		
		while (!exit) {
			System.out.println("********************************************");
			System.out.println("1.학생 추가");
			System.out.println("2.학생 삭제");
			System.out.println("3.학생 검색");
			System.out.println("4.과목 검색");
			System.out.println("5.현황 출력");
			System.out.println("6.프로그램 종료하기");
			System.out.println("********************************************");

			int a = input.nextInt();

			switch (a) {
			case 1:

				while (true) {
					student_add();

					stu1.listsub.addAll(Arrays.asList());
					stu1.listscore.addAll(Arrays.asList());
					stu1.listCscore.addAll(Arrays.asList());
					st.add(stu1);

					stu1 = new studentm();
					System.out.println("메뉴로 돌아가기 1번  계속 추가할려면 아무숫자나 입력 ");

					if (input.nextInt() == 1)
						break;
				}
				break;

			case 2:

				while (true) {
					int a1 = student_del();
					if (a1 == -1)
						break;
					st.remove(a1);

					System.out.println("메뉴로 돌아가기 1번  계속 추가할려면 아무숫자나 입력 ");
					if (input.nextInt() == 1)
						break;
				}
				break;

			case 3:

				System.out.println("학생 번호를 입력하시오.");
				int po5 = listB.indexOf(input.next());
				while (true) {
					if (po5 == -1) {
						System.out.println("없는1 번호입니다.");
						break;
					}
					try {
						System.out.println("이름명 : " + listA.get(po5) + " 학번  : " + listB.get(po5) + " 전화번호:"
								+ listC.get(po5) + " 이메일: " + listemail.get(po5) + " 소속(학부)" + listdepart.get(po5)
								+ " 장학금 :" + listSc.get(po5));
					} catch (IndexOutOfBoundsException e) {
						System.out.println("없는2 번호입니다.");
						break;
					}

					System.out.println("*************************************");
					System.out.println("학생검색  \n1.정보 변경\n2.성적관리\n3.수강관리\n4.메뉴로 돌아가기");
					int s = input.nextInt();
					if (s == 1) {

						System.out.println("1.이름 변경 2.학번 변경 3.전화번호  4.이메일  5.소속(학부) 6.장학금  7.뒤로가기");

						int b = input.nextInt();
						switch (b) {
						case 1:
							System.out.println("변경할 이름을 입력하시오.");
							listA.set(po5, input.next());
							System.out.println("변경완료!");
							break;
						case 2:
							System.out.println("변경할 학번을 입력하시오");
							listB.set(po5, input.next());
							System.out.println("변경완료!");
							break;
						case 3:
							System.out.println("변경할 전화번호 입력하시오");
							listC.set(po5, input.next());
							System.out.println("변경완료!");
							break;
						case 4:
							System.out.println("변경할 이메일 입력하시오");
							listemail.set(po5, input.next());
							System.out.println("변경완료!");
							break;
						case 5:
							System.out.println("변경할 소속 입력하시오");
							listdepart.set(po5, input.next());
							System.out.println("변경완료!");
							break;
						case 6:
							System.out.println("변경할 장학금 금액을 입력하시오");
							listSc.set(po5, input.next());
							System.out.println("변경완료!");
							break;
						default:
							break;
						}

						continue;

					} else if (s == 2) {
						System.out.println("성적관리");
						while (true) {
							System.out.println("1.전체 성적 출력\n2.성적수정\n3.성적입력\n4.뒤로가기");
							int d = input.nextInt();
							int[] a1 = new int[40];

							if (d == 1) {

								for (int i = 0; i < st.get(po5).listsub.size(); i++) {// 정렬용

									a1[i] = (int) st.get(po5).listsub.get(i);

									System.out.println(
											" 과목 " + listsubname.get(a1[i]) + " 성적: " + st.get(po5).listscore.get(i));
								}

							} else if (d == 2) {
								for (int i = 0; i < st.get(po5).listsub.size(); i++) {

									a1[i] = (int) st.get(po5).listsub.get(i);

									System.out.println(i + " :" + " 과목 " + listsubname.get(a1[i]));
								}
								try {// 수정과목번호 예외처리
									System.out.println("수정할 과목 번호를 입력하시오..");
									int n = input.nextInt();
									System.out.println(" 과목 :" + listsubname.get((int) st.get(po5).listsub.get(n)) + " 성적: "
											+ st.get(po5).listscore.get(n) + "\n수정할 점수를 입력하시오");
									st.get(po5).listscore.set(n, input.nextDouble());
								} catch (IndexOutOfBoundsException E) {
									System.out.println("잘못입력하셧습니다.");
									continue;
								}

							}

							else if (d == 3) {
								
								for (int i = 0; i < listsubname.size(); i++) {
									System.out.print(i + ".과목명 :  " + listsubname.get(i) + "\t\t");
									if (i % 5 == 0)
										System.out.println();

								}
								System.out.println("성적을 추가할 과목번호를 입력하시오");
								int a5=input.nextInt();
								if(st.get(po5).listsub.contains(a5)){
									System.out.println("이미 추가되어 있는 과목입니다.");
									break;
									
								}
								st.get(po5).listsub.add(a5);
								System.out.println("성적 입력하시오.");
								st.get(po5).listscore.add(input.nextDouble());
								
							}
							else if(d==4){
								break;// 2번 메뉴 종료
							}
						}
						continue;// 뒤로 돌아기기

					} else if (s == 3) {

						System.out.println("수강관리");
						while (true) {
							System.out.println("1.전체 수강 현황\n2.수강 신청\n3.수강 변경\n4.뒤로 돌아가기");
							int d = input.nextInt();
							if (d == 1) {
								int b21[] = new int[20];
								for (int i = 0; i < st.get(po5).listCscore.size(); i++) {// 정렬용

									b21[i] = (int) st.get(po5).listCscore.get(i);

									System.out.println(i + " : " + listsubname.get(b21[i]));
								}

							}

							else if (d == 2) {
								System.out.println("수강신청");

								for (int i = 0; i < listsubname.size(); i++) {
									System.out.print(i + ".과목명 :  " + listsubname.get(i) + "\t\t");
									if (i % 5 == 0)
										System.out.println();

								}
								System.out.println("\n 신청할 과목 번호를 입력하시오.");
								int n3 = input.nextInt();
								if (st.get(po5).listCscore.contains(n3) == true) {
									System.out.println("이미 신청한 과목입니다.");
								} else {
									st.get(po5).listCscore.add(n3);
								}
							}

							else if (d == 3) {

								int b3[] = new int[20];// b3는 과목 연결용 변수

								for (int i = 0; i < st.get(po5).listCscore.size(); i++) {// 정렬용

									b3[i] = (int) st.get(po5).listCscore.get(i);
									System.out.println(i + ". " + "과목" + listsubname.get(b3[i]));

								}
								System.out.println("수강 삭제할 번호를 입력하시오");

								st.get(po5).listCscore.remove(input.nextInt());

							} else if (d == 4) {
								break;
							}

						}
					} else if (s == 4) {
						break;
					}

					continue;//뒤로 돌아가기

				}
				break;

			case 4:

				System.out.println("과목을 입력하시오");
				String s = input.next();
				if (listsubname.contains(s) == false) {
					System.out.println("없는 과목명 입니다. 다시 입력하세주세요.");
					break;
				}
				int a1 = listsubname.indexOf(s);// a1변수는 과목 자리.
				System.out.println("과목명: " + listsubname.get(a1) + " 담당 교수 :" + Listsubpro.get(a1) + " 학강실: "
						+ Listsubroom.get(a1));
				while (true) {

					System.out.println("1.정보변경\n2.수강생 확인\n3.수강생 추가\n4.수강생 삭제\n5.메뉴로 돌아가기");
					int g = input.nextInt();

					if (g == 1) {

						System.out.println("1.과목명  2.담당 교수  3.학강실 4.뒤로가기");
						int n2 = input.nextInt();

						switch (n2) {
						case 1:
							System.out.println("1.과목명 :");
							listsubname.set(a1, input.next());
							System.out.println("변경되었습니다.");
							break;
						case 2:
							System.out.println("2.담당 교수:");
							Listsubpro.set(a1, input.next());

							break;
						case 3:
							System.out.println("3.학강실");
							Listsubroom.set(a1, input.next());
							break;

						default:
							break;
						}

					}

					else if (g == 2) {
						System.out.println("수강생 확인");

						for (int i = 0; i < listA.size(); i++) {
							if (st.get(i).listCscore.contains(a1) == true) {
								System.out.println("이름명 : " + listA.get(i) + " 학번  : " + listB.get(i) + " 전화번호:"
										+ listC.get(i) + " 이메일: " + listemail.get(i) + " 소속(학부)" + listdepart.get(i));

							}

						}

					} else if (g == 3) {

						System.out.println("수강생 추가");
						System.out.println("학번을 입력하시오!");

						int b4 = listB.indexOf(input.next());
						try {
							if (st.get(b4).listCscore.contains(a1)) {
								System.out.println("이미 추가되어 있는 학생입니다.");
							}
						} catch (IndexOutOfBoundsException e) {
							System.out.println("존재 하지 않는 학번입니다.");
							continue;
						}
						st.get(b4).listCscore.add(a1);

					} else if (g == 4) {
						System.out.println("수강생 삭제");
						System.out.println("학번을 입력하시오!");

						int b4 = listB.indexOf(input.next());

						try {

							int a2 = st.get(b4).listCscore.indexOf(a1);

							st.get(b4).listCscore.remove(a2);
							System.out.println("삭제되었습니다.");
						} catch (IndexOutOfBoundsException e) {
							System.out.println("존재하지 않은 학번입니다.");
							continue;
						}
					}

					else if (g == 5) {
						break;
					} else {

					}
				}

				break;

			case 5:
				while (true) {
					System.out.println("1.학생 현황 요약\n2.수강 현황 요약\n3.전체 학생 출력\n4.메뉴로 돌아가기");
					int g = input.nextInt();
					double sum = 0;
					int i4 = 0;
					if (g == 1) {
						double[][] b3 = new double[100][40];
						for (int i = 0; i < listA.size(); i++) {// 정렬용
							for (int j = 0; j < st.get(i).listscore.size(); j++) {
								b3[i][j] = (double) st.get(i).listscore.get(j);

								sum += b3[i][j];
								i4++;

							}
						}
						int sum1 = 0;
						for (int i = 0; i < listA.size(); i++) {// 정렬용

							sum1 += st.get(i).listCscore.size();

						}

						double ave = sum / i4;
						double ave1 = sum1 / (double) listA.size();

						System.out.println("전체 학생 숫자: " + listA.size() + "\n전체평균학점: " + String.format("%.3f", ave)
								+ " 전체 수강 과목 평균 개수 : " + ave1);

					} else if (g == 2) {
						int sum3[] = new int[100];
						System.out.println("수강 현황 요약");
						System.out.println(listA.size());
						// 과목X학생X선택한 과목으로... 과목별 수강생 숫자 찾기.
						for (int k = 0; k < listsubname.size(); k++) {
							for (int i1 = 0; i1 < listA.size(); i1++) {// 정렬용
								for (int j = 0; j < st.get(i1).listCscore.size(); j++) {
									if (st.get(i1).listCscore.contains(k) == true) {
	
										sum3[k]++;
										break;
									}

								}
							}
						}
						for (int i = 0; i < listsubname.size(); i++)
							System.out.println("과목명 : " + listsubname.get(i) + " 담당교수 : " + Listsubpro.get(i)
									+ " 학강실 : " + Listsubroom.get(i) + " 수강생 숫자:" + sum3[i]);
					} else if (g == 3) {
						System.out.println("전체 학생 출력");

						for (int i = 0; i < listA.size(); i++)
							System.out.println("이름: " + listA.get(i) + "" + " 학번: " + listB.get(i) + " 전화번호:"
									+ listC.get(i) + " 이메일: " + listemail.get(i) + " 소속(학부)" + listdepart.get(i));
					}

					else if (g == 4) {
						break;
					}
				}
				break;
			case 6: exit=true;
			System.out.println("프로그램 종료");
			break;
			default:
				System.out.println("숫자를 다시 입력하시오!");
			}

		}

	}

}
