package com.metacoding.upload;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class UploadRequest {

    @Data
    public static class V1DTO {
        private String username;
        private MultipartFile img;

        public Upload toEntity(String profileUrl) {
            // builder로 변환해서 넣기 - toEntity를 변환
            return Upload.builder()
                    .username(username)
                    .profileUrl(profileUrl).build();
        }
    }
}