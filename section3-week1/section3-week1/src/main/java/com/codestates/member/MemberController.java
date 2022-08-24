package com.codestates.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/v1/members")
@Validated
public class MemberController {
    // 회원 정보 등록
    @PostMapping
    public ResponseEntity  postMember(@Valid @RequestBody MemberPostDto memberPostDto){
        return new ResponseEntity<MemberPostDto>(memberPostDto, HttpStatus.CREATED);
    }

    //회원 정보 수정
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Min(1) long memberId,
                                      @Valid @RequestBody MemberPatchDto memberPatchDto){

        memberPatchDto.setMemeberId(memberId);

        return new ResponseEntity<>(memberPatchDto, HttpStatus.OK);
    }

    // 특정 회원의 정보를 클라이언트 쪽에 제공하는 핸들러 메서드
    @GetMapping("/{member-id}")
    public ResponseEntity  getMember(@PathVariable("member-id") long memberId){
        System.out.println("# memberId: " + memberId);

        //not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //회원 정보를 클라이언트에게 제공하는 핸들러 메서드드
   @GetMapping
    public ResponseEntity  getMembers() {
        System.out.println("# get Members");

        //not implementation
       return new ResponseEntity<>(HttpStatus.OK);
    }

    //회원 정보 삭제
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId){
        // No need business logic

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
