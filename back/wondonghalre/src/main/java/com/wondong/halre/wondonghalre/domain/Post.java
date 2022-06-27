package com.wondong.halre.wondonghalre.domain;

import com.wondong.halre.wondonghalre.domain.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "W_POST")
public class Post extends BaseEntity {
    @GeneratedValue
    @Id
    @Column(name = "post_id")
    private Long id;

    @Column(name = "post_content")
    private String content;

    @Column(name = "post_day")
    private String day;
}
