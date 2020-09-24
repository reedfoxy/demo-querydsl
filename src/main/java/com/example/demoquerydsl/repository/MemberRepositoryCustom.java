package com.example.demoquerydsl.repository;

import com.example.demoquerydsl.dto.MemberSearchCondition;
import com.example.demoquerydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);
}
