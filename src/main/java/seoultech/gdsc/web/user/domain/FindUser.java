package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindUser {

    private final userRepository userRepository;

    public User ById(int id){
        return userRepository.findById(id);

    }
}
