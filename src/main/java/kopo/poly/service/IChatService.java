package kopo.poly.service;

import kopo.poly.dto.ChatDTO;

import java.util.List;
import java.util.Set;

public interface IChatService {

    // 인터페이스 선언된 변수는 상수로 선언(final과 동일)되면, 한번 메모리에 로딩된 후 값은 변경할 수 없음
    String roomInfoKey = "myRoomKey";

    // 채팅 룸 리스트 가져오기
    Set<String> getRoomList() throws Exception;

    // 채팅 대화 저장하기
    List<ChatDTO> insertChat(ChatDTO pDTO) throws Exception;

    // 채팅 대화 가져오기
    List<ChatDTO> getChat(ChatDTO pDTO) throws Exception;

}
