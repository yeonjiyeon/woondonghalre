package com.wondong.halre.wondonghalre.domain;

import com.wondong.halre.wondonghalre.domain.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "W_IMAGE")
public class Image extends BaseEntity {
    @GeneratedValue
    @Id
    @Column(name = "image_id")
    private Long id;

    @Column(name = "image_originalNm")
    private String originalNm;

    @Column(name = "image_realNm")
    private String realNm;

    @Column(name = "image_route")
    private String route;
}
