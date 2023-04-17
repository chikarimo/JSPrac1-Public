package com.example.demo.login.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


//7-3-2ポイント1:@Aspect
@Aspect
@Component
public class LogAspect{

	//7-3-4_ポイント：@annotation
//	@Around("@within(org.springframework.stereotype.Controller)")
//	public Object startLog(ProceedingJoinPoint jp)throws Throwable{
//		System.out.println("メソッド開始AR："+jp.getSignature());
//
//		try {
//			//7-3-3ポイント2：メソッド実行
//			Object result=jp.proceed();
//
//			System.out.println("メソッド終了AR："+jp.getSignature());
//
//			return result;
//		}catch(Exception e) {
//			System.out.println("メソッド異常終了AR："+jp.getSignature());
//			e.printStackTrace();
//			throw e;
//		}
//	}
	//7-3-2ポイント2:AOPの実装
	@Before("execution(* *..*.User*.*(..))")
	public void startLog(JoinPoint jp) {
		System.out.println("メソッド開始："+jp.getSignature());
	}

	//7-3-2ポイント2:AOPの実装
	@After("execution(* *..*.User*.*(..))")
	public void endLog(JoinPoint jp) {
		System.out.println("メソッド終了："+jp.getSignature());
	}
//
//	//7-3-3ポイント1:@Around
//	//7-3-4ポイント1:Bean名で指定
//	//@Around("execution(* *..*.*Controller.*(..))")
//	@Around("bean(*Controller)")
//	public Object startLog(ProceedingJoinPoint jp) throws Throwable{
//
//		System.out.println("メソッド開始AR："+jp.getSignature());
//
//		try {
//			//7-3-3ポイント2：メソッド実行
//			Object result=jp.proceed();
//
//			System.out.println("メソッド終了AR："+jp.getSignature());
//
//			return result;
//		}catch(Exception e) {
//			System.out.println("メソッド異常終了AR："+jp.getSignature());
//			e.printStackTrace();
//			throw e;
//		}
//	}

//8-2-2_//コントローラーのログ出力
//	@Around("execution(* *..*.*Controller.*(..))")
//	public Object startLog(ProceedingJoinPoint jp) throws Throwable{
//
//		System.out.println("Daoメソッド開始："+jp.getSignature());
//
//		try {
//			//メソッド実行
//			Object result = jp.proceed();
//
//			System.out.println("Daoメソッド終了："+jp.getSignature());
//
//			return result;
//		} catch(Exception e) {
//
//			System.out.println("Daoメソッド異常終了："+jp.getSignature());
//			e.printStackTrace();
//			throw e;
//		}
//	}
}

