package com.volkruss.demo.repository;

import java.util.List;

import com.volkruss.demo.entity.Store;

/*
 * ������@Mapper������ƁA�����K�w�̃��\�[�X�t�H���_�ɂ���xml�t�@�C����Ǎ��܂�
 * �����sql��S��mapping�t�H���_�Ɋi�[���Ă��邽��application.yml�ɂ�xml�t�@�C���Ƃ̃o�C���h�ݒ���L�q���Ă��܂��B
 * 
 * �����MapperScan��Application�N���X�ɂĕt�^���Ă��܂��B
 * ����ɂ����Bean���o�^����܂��B
 * �܂�@Mapper��t�����ꍇ�ł�Bean�o�^����܂��B
 * 
 */
public interface StoreRepository {
	List<Store> findAll();
	Store findById(int id);
}
