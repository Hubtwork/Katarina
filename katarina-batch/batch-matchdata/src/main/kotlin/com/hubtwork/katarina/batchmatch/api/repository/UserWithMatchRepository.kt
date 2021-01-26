package com.hubtwork.katarina.batchmatch.api.repository

import com.hubtwork.katarina.batchmatch.api.domain.SoloRank
import com.hubtwork.katarina.batchmatch.api.domain.UserWithMatch
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserWithMatchRepository: JpaRepository<UserWithMatch, String>